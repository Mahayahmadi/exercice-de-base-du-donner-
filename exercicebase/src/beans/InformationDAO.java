package beans;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

		public class InformationDAO {
			
		    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
		    private static final String DB_USERNAME = "system";
		    private static final String DB_PASSWORD = "system";
		    public class Information {
		        private int id;
		        private String nom;
		        private String prenom;
		        private String adresse;
		        private String telephone;
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public String getNom() {
					return nom;
				}
				public void setNom(String nom) {
					this.nom = nom;
				}
				public String getPrenom() {
					return prenom;
				}
				public void setPrenom(String prenom) {
					this.prenom = prenom;
				}
				public String getAdresse() {
					return adresse;
				}
				public void setAdresse(String adresse) {
					this.adresse = adresse;
				}
				public String getTelephone() {
					return telephone;
				}
				public void setTelephone(String telephone) {
					this.telephone = telephone;
				}

		       
		    }


		    public static List<Information> getAllInformations() {
		        List<Information> informations = new ArrayList<>();

		        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
		            String sql = "SELECT * FROM informations";
		            System.out.println("Connected!");
		            Statement stmt = conn.createStatement();
		            
		            
		            ResultSet rs = stmt.executeQuery(sql);

		            while (rs.next()) {
		                Information info = Information();
		                info.setId(rs.getInt("id"));
		                info.setNom(rs.getString("nom"));
		                info.setPrenom(rs.getString("prenom"));
		                info.setAdresse(rs.getString("adresse"));
		                info.setTelephone(rs.getString("telephone"));

		                informations.add(info);
		            }

		            rs.close();
		            stmt.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }

		        return informations;
		    }


			private static Information Information() {
				// TODO Auto-generated method stub
				return null;
			}
			public static void main(String[] args) {
				new InformationDAO();
			}
		}

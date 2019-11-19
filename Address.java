
public class Address {
			private String street;
			private String postcode;
			private String region;
			private String district;
			
			/**
			 * the constructor of address
			 * @param street
			 * @param region
			 * @param district
			 * @param postcode
			 */
			public Address(String street, String region, String district, String postcode) {
				this.street = street;
				this.postcode = postcode;
				this.region = region;
				this.district = district;
			}
			/**
			 * to set the street
			 * @param street
			 */
			public void setStreet(String street) {
				this.street = street;
			}
			/**
			 * to set the postcode
			 * @param postcode
			 */
			public void setPostcode(String postcode) {
				this.postcode = postcode;
			}
			/**
			 * to set the region
			 * @param region
			 */
			public void setRegion(String region) {
				this.region = region;
			}
			/**
			 * to set the district
			 * @param district
			 */
			public void setDistrict(String district) {
				this.district = district;
			}
			/**
			 * to print address
			 */
			public void printAddress() {
				System.out.println("The address is: "+ street+", "+ region+", "+ district+" "+ postcode);
			}
}

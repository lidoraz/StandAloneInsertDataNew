package com.xyz;



/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
public class UserPresentProbe extends Dto{
			private String userID;

			private String uuid;
			private String timestamp;




	public UserPresentProbe() {
	}

	public UserPresentProbe(String userID, String uuid) {
		this.userID = userID;
		this.uuid = uuid;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

		public String toString() {
		return ""
				+ userID + "\t"
				+ uuid + "\t"
				+ timestamp ;
	}
}
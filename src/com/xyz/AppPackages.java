package com.xyz;



/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */

public class AppPackages extends Dto  {

	
		private String userId;

	
		private String uuid;
			private String action;
	
		private String appPackage;
			private String appUID;

			private String appName;

			private String installSrc;

			private String installTime;

			private String packageHASH;

			private String permissions;
			private String versionName;
			private String versionCode;

			private String sherlockVersion;


	public AppPackages(String appPackage, String userId, String uuid) {
		this.appPackage = appPackage;
		this.userId = userId;
		this.uuid = uuid;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppPackage() {
		return appPackage;
	}

	public void setAppPackage(String appPackage) {
		this.appPackage = appPackage;
	}

	public String getAppUID() {
		return appUID;
	}

	public void setAppUID(String appUID) {
		this.appUID = appUID;
	}

	public String getInstallSrc() {
		return installSrc;
	}

	public void setInstallSrc(String installSrc) {
		this.installSrc = installSrc;
	}

	public String getInstallTime() {
		return installTime;
	}

	public void setInstallTime(String installTime) {
		this.installTime = installTime;
	}

	public String getPackageHASH() {
		return packageHASH;
	}

	public void setPackageHASH(String packageHASH) {
		this.packageHASH = packageHASH;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public String getSherlockVersion() {
		return sherlockVersion;
	}

	public void setSherlockVersion(String sherlockVersion) {
		this.sherlockVersion = sherlockVersion;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

		public String toString() {
		return ""
				+ userId + "\t"
				+ uuid + "\t"
				+ action + "\t"
				+ appPackage + "\t"
				+ appUID + "\t"
				+ appName + "\t"
				+ installSrc + "\t"
				+ installTime + "\t"
				+ packageHASH + "\t"
				+ permissions + "\t"
				+ versionName + "\t"
				+ versionCode + "\t"
				+ sherlockVersion;
	}
}
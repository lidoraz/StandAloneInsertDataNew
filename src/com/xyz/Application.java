package com.xyz;


/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
public class Application extends Dto {

    private String userId;
    private String uuid;

    private String applicationName;
    private String cpuUsage;

    private String packageName;
    private String packageUID;

    private String uidRxBytes;

    private String uidRxPackets;

    private String uidTxBytes;

    private String uidTxPackets;

    private String cguestTime;

    private String cmajFlt;

    private String cstime;

    private String cutime;

    private String dalvikPrivateDirty;

    private String dalvikPss;

    private String dalvikSharedDirty;
    private String guestTime;
    private String importance;

    private String importanceReasonCode;

    private String importanceReasonPid;
    private String lru;
    private String nativePrivateDirty;

    private String nativePss;

    private String nativeSharedDirty;

    private String numThreads;

    private String otherPrivateDirty;

    private String otherPss;

    private String otherSharedDirty;

    private String pgid;

    private String pid;

    private String ppid;

    private String priority;

    private String rss;

    private String rsslim;

    private String sid;

    private String startTime;

    private String state;

    private String stime;

    private String tcomm;

    private String utime;
    private String vsize;

    private String versionCode;

    private String versionName;
    private String sherlockVersion;

    private String tgpid;
    private String flags;
    private String wchan;
    private String exitSignal;

    private String minflt;
    private String cminflt;
    private String majflt;
    private String startcode;
    private String endcode;
    private String nice;

    private String itrealvalue;

    private String processor;

    private String rtPriority;


    public Application() {
    }

    public Application(String pid, String userId, String uuid) {
        this.pid = pid;
        this.userId = userId;
        this.uuid = uuid;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getCguestTime() {
        return cguestTime;
    }

    public void setCguestTime(String cguestTime) {
        this.cguestTime = cguestTime;
    }

    public String getCmajFlt() {
        return cmajFlt;
    }

    public void setCmajFlt(String cmajFlt) {
        this.cmajFlt = cmajFlt;
    }

    public String getCminflt() {
        return cminflt;
    }

    public void setCminflt(String cminflt) {
        this.cminflt = cminflt;
    }

    public String getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public String getCstime() {
        return cstime;
    }

    public void setCstime(String cstime) {
        this.cstime = cstime;
    }

    public String getCutime() {
        return cutime;
    }

    public void setCutime(String cutime) {
        this.cutime = cutime;
    }

    public String getDalvikPrivateDirty() {
        return dalvikPrivateDirty;
    }

    public void setDalvikPrivateDirty(String dalvikPrivateDirty) {
        this.dalvikPrivateDirty = dalvikPrivateDirty;
    }

    public String getDalvikPss() {
        return dalvikPss;
    }

    public void setDalvikPss(String dalvikPss) {
        this.dalvikPss = dalvikPss;
    }

    public String getDalvikSharedDirty() {
        return dalvikSharedDirty;
    }

    public void setDalvikSharedDirty(String dalvikSharedDirty) {
        this.dalvikSharedDirty = dalvikSharedDirty;
    }

    public String getEndcode() {
        return endcode;
    }

    public void setEndcode(String endcode) {
        this.endcode = endcode;
    }

    public String getExitSignal() {
        return exitSignal;
    }

    public void setExitSignal(String exitSignal) {
        this.exitSignal = exitSignal;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getGuestTime() {
        return guestTime;
    }

    public void setGuestTime(String guestTime) {
        this.guestTime = guestTime;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getImportanceReasonCode() {
        return importanceReasonCode;
    }

    public void setImportanceReasonCode(String importanceReasonCode) {
        this.importanceReasonCode = importanceReasonCode;
    }

    public String getImportanceReasonPid() {
        return importanceReasonPid;
    }

    public void setImportanceReasonPid(String importanceReasonPid) {
        this.importanceReasonPid = importanceReasonPid;
    }

    public String getItrealvalue() {
        return itrealvalue;
    }

    public void setItrealvalue(String itrealvalue) {
        this.itrealvalue = itrealvalue;
    }

    public String getLru() {
        return lru;
    }

    public void setLru(String lru) {
        this.lru = lru;
    }

    public String getMajflt() {
        return majflt;
    }

    public void setMajflt(String majflt) {
        this.majflt = majflt;
    }

    public String getMinflt() {
        return minflt;
    }

    public void setMinflt(String minflt) {
        this.minflt = minflt;
    }

    public String getNativePrivateDirty() {
        return nativePrivateDirty;
    }

    public void setNativePrivateDirty(String nativePrivateDirty) {
        this.nativePrivateDirty = nativePrivateDirty;
    }

    public String getNativePss() {
        return nativePss;
    }

    public void setNativePss(String nativePss) {
        this.nativePss = nativePss;
    }

    public String getNativeSharedDirty() {
        return nativeSharedDirty;
    }

    public void setNativeSharedDirty(String nativeSharedDirty) {
        this.nativeSharedDirty = nativeSharedDirty;
    }

    public String getNice() {
        return nice;
    }

    public void setNice(String nice) {
        this.nice = nice;
    }

    public String getNumThreads() {
        return numThreads;
    }

    public void setNumThreads(String numThreads) {
        this.numThreads = numThreads;
    }

    public String getOtherPrivateDirty() {
        return otherPrivateDirty;
    }

    public void setOtherPrivateDirty(String otherPrivateDirty) {
        this.otherPrivateDirty = otherPrivateDirty;
    }

    public String getOtherPss() {
        return otherPss;
    }

    public void setOtherPss(String otherPss) {
        this.otherPss = otherPss;
    }

    public String getOtherSharedDirty() {
        return otherSharedDirty;
    }

    public void setOtherSharedDirty(String otherSharedDirty) {
        this.otherSharedDirty = otherSharedDirty;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageUID() {
        return packageUID;
    }

    public void setPackageUID(String packageUID) {
        this.packageUID = packageUID;
    }

    public String getPgid() {
        return pgid;
    }

    public void setPgid(String pgid) {
        this.pgid = pgid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPpid() {
        return ppid;
    }

    public void setPpid(String ppid) {
        this.ppid = ppid;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRss() {
        return rss;
    }

    public void setRss(String rss) {
        this.rss = rss;
    }

    public String getRsslim() {
        return rsslim;
    }

    public void setRsslim(String rsslim) {
        this.rsslim = rsslim;
    }

    public String getRtPriority() {
        return rtPriority;
    }

    public void setRtPriority(String rtPriority) {
        this.rtPriority = rtPriority;
    }

    public String getSherlockVersion() {
        return sherlockVersion;
    }

    public void setSherlockVersion(String sherlockVersion) {
        this.sherlockVersion = sherlockVersion;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartcode() {
        return startcode;
    }

    public void setStartcode(String startcode) {
        this.startcode = startcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getTcomm() {
        return tcomm;
    }

    public void setTcomm(String tcomm) {
        this.tcomm = tcomm;
    }

    public String getTgpid() {
        return tgpid;
    }

    public void setTgpid(String tgpid) {
        this.tgpid = tgpid;
    }

    public String getUidRxBytes() {
        return uidRxBytes;
    }

    public void setUidRxBytes(String uidRxBytes) {
        this.uidRxBytes = uidRxBytes;
    }

    public String getUidRxPackets() {
        return uidRxPackets;
    }

    public void setUidRxPackets(String uidRxPackets) {
        this.uidRxPackets = uidRxPackets;
    }

    public String getUidTxBytes() {
        return uidTxBytes;
    }

    public void setUidTxBytes(String uidTxBytes) {
        this.uidTxBytes = uidTxBytes;
    }

    public String getUidTxPackets() {
        return uidTxPackets;
    }

    public void setUidTxPackets(String uidTxPackets) {
        this.uidTxPackets = uidTxPackets;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
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

    public String getVsize() {
        return vsize;
    }

    public void setVsize(String vsize) {
        this.vsize = vsize;
    }

    public String getWchan() {
        return wchan;
    }

    public void setWchan(String wchan) {
        this.wchan = wchan;
    }

    public String toString() {
        return ""
                + userId + "\t"
                + uuid + "\t"
                + applicationName + "\t"
                + cpuUsage + "\t"
                + packageName + "\t"
                + packageUID + "\t"
                + uidRxBytes + "\t"
                + uidRxPackets + "\t"
                + uidTxBytes + "\t"
                + uidTxPackets + "\t"
                + cguestTime + "\t"
                + cmajFlt + "\t"
                + cstime + "\t"
                + cutime + "\t"
                + dalvikPrivateDirty + "\t"
                + dalvikPss + "\t"
                + dalvikSharedDirty + "\t"
                + guestTime + "\t"
                + importance + "\t"
                + importanceReasonCode + "\t"
                + importanceReasonPid + "\t"
                + lru + "\t"
                + nativePrivateDirty + "\t"
                + nativePss + "\t"
                + nativeSharedDirty + "\t"
                + numThreads + "\t"
                + otherPrivateDirty + "\t"
                + otherPss + "\t"
                + otherSharedDirty + "\t"
                + pgid + "\t"
                + pid + "\t"
                + ppid + "\t"
                + priority + "\t"
                + rss + "\t"
                + rsslim + "\t"
                + sid + "\t"
                + startTime + "\t"
                + state + "\t"
                + stime + "\t"
                + tcomm + "\t"
                + utime + "\t"
                + vsize + "\t"
                + versionCode + "\t"
                + versionName + "\t"
                + sherlockVersion + "\t"
                + tgpid + "\t"
                + flags + "\t"
                + wchan + "\t"
                + exitSignal + "\t"
                + minflt + "\t"
                + cminflt + "\t"
                + majflt + "\t"
                + startcode + "\t"
                + endcode + "\t"
                + nice + "\t"
                + itrealvalue + "\t"
                + processor + "\t"
                + rtPriority;
    }
}
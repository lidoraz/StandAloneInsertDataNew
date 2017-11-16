package com.BusinessLogic;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.utilitys.HelpFunctions;
import com.xyz.Application;

import java.util.concurrent.ConcurrentHashMap;

public class T4 implements T4Interface {

    private static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(T4.class.getName());

    /**
     * parse T4
     * BatteryProbe
     * TrafficStatsProbe
     * ApplicationInsert
     */


    private ConcurrentHashMap<Integer, Object>[] tableHashMaps = Dao.tableHashMaps;


    public void BatteryProbe(JsonObject json, String userName, String version) {


        String uuid = json.get("UUID").toString().replace("\"", "");

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T4 t4 = (com.xyz.T4) tableHashMaps[Dao._T4].get(hashCode);
        if (t4 == null) {
            t4 = new com.xyz.T4(userName, uuid);
            t4.setCreatedOnTimestamp(System.currentTimeMillis());
        }
        t4.setVersion(version);
        t4.setBatteryChargeType(HelpFunctions.checkNull(json.get("charge_type")));
        t4.setBatteryCurrentAvg(HelpFunctions.checkNull(json.get("current_avg")));
        t4.setBatteryHealth(HelpFunctions.checkNull(json.get("health")));
        t4.setBatteryIconSmall(HelpFunctions.checkNull(json.get("icon-small")));
        t4.setBatteryInvalidCharger(HelpFunctions.checkNull(json.get("invalid_charger")));
        t4.setBatteryLevel(HelpFunctions.checkNull(json.get("level")));
        t4.setBatteryOnline(HelpFunctions.checkNull(json.get("online")));
        t4.setBatteryPlugged(HelpFunctions.checkNull(json.get("plugged")));
        t4.setBatteryPresent(HelpFunctions.checkNull(json.get("present")));
        t4.setBatteryScale(HelpFunctions.checkNull(json.get("scale")));
        t4.setBatteryStatus(HelpFunctions.checkNull(json.get("status")));
        t4.setBatteryTechnology(HelpFunctions.checkNull(json.get("technology")).replace("\"", ""));
        t4.setBatteryTemperature(HelpFunctions.checkNull(json.get("temperature")));
        String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "");
        t4.setBatteryTimestamp(HelpFunctions.calcTimeStamp(StringTime));
        t4.setBatteryVoltage(HelpFunctions.checkNull(json.get("voltage")));


    }


    public void TrafficStatsProbe(JsonObject json, String userName, String version) {

        String uuid = json.get("UUID").toString().replace("\"", "");

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T4 t4 = (com.xyz.T4) tableHashMaps[Dao._T4].get(hashCode);
        if (t4 == null) {
            t4 = new com.xyz.T4(userName, uuid);
            tableHashMaps[Dao._T4].put(hashCode, t4);
            t4.setCreatedOnTimestamp(System.currentTimeMillis());
        }
        t4.setVersion(version);
        t4.setCpuHertz((HelpFunctions.checkNull(json.get("CpuHertz")).replace("\"", "")));
        if (!HelpFunctions.checkNull(json.getAsJsonObject("CpuStats")).equals("NULL")) {
            JsonObject cpuStats = json.getAsJsonObject("CpuStats");
            t4.setCpu0((HelpFunctions.checkNull(cpuStats.get("CPU_0"))));
            t4.setCpu1((HelpFunctions.checkNull(cpuStats.get("CPU_1"))));
            t4.setCpu2((HelpFunctions.checkNull(cpuStats.get("CPU_2"))));
            t4.setCpu3((HelpFunctions.checkNull(cpuStats.get("CPU_3"))));
            t4.setTotalCPU((HelpFunctions.checkNull(cpuStats.get("Total CPU"))));
        }
        if (!HelpFunctions.checkNull(json.getAsJsonObject("TotalMemory")).equals("NULL")) {
            JsonObject cpuStats = json.getAsJsonObject("TotalMemory");
            t4.setTotalMemoryFreeSize((HelpFunctions.checkNull(cpuStats.get("free_size"))));
            t4.setTotalMemoryMaxSize((HelpFunctions.checkNull(cpuStats.get("max_size"))));
            t4.setTotalMemoryTotalSize((HelpFunctions.checkNull(cpuStats.get("total_size"))));
            t4.setTotalMemoryUsedSize((HelpFunctions.checkNull(cpuStats.get("used_size"))));
            t4.setMemTotal((HelpFunctions.checkNull(cpuStats.get("MemTotal"))).replace("\"", ""));
            t4.setMemFree((HelpFunctions.checkNull(cpuStats.get("MemFree"))).replace("\"", ""));
            t4.setBuffers((HelpFunctions.checkNull(cpuStats.get("Buffers"))).replace("\"", ""));
            t4.setCached((HelpFunctions.checkNull(cpuStats.get("Cached"))).replace("\"", ""));
            t4.setSwapCached((HelpFunctions.checkNull(cpuStats.get("SwapCached"))).replace("\"", ""));
            t4.setActive((HelpFunctions.checkNull(cpuStats.get("Active"))).replace("\"", ""));
            t4.setInactive((HelpFunctions.checkNull(cpuStats.get("Inactive"))).replace("\"", ""));
            t4.setActiveAnon((HelpFunctions.checkNull(cpuStats.get("Active(anon)")).replace("\"", "")));
            t4.setInactiveAnon((HelpFunctions.checkNull(cpuStats.get("Inactive(anon)")).replace("\"", "")));
            t4.setActiveFile((HelpFunctions.checkNull(cpuStats.get("Active(file)")).replace("\"", "")));
            t4.setInactiveFile((HelpFunctions.checkNull(cpuStats.get("Inactive(file)")).replace("\"", "")));
            t4.setUnevictable((HelpFunctions.checkNull(cpuStats.get("Unevictable"))).replace("\"", ""));
            t4.setMlocked((HelpFunctions.checkNull(cpuStats.get("Mlocked"))).replace("\"", ""));
            t4.setHighTotal((HelpFunctions.checkNull(cpuStats.get("HighTotal"))).replace("\"", ""));
            t4.setHighFree((HelpFunctions.checkNull(cpuStats.get("HighFree"))).replace("\"", ""));
            t4.setLowTotal((HelpFunctions.checkNull(cpuStats.get("LowTotal"))).replace("\"", ""));
            t4.setLowFree((HelpFunctions.checkNull(cpuStats.get("LowFree"))).replace("\"", ""));
            t4.setSwapTotal((HelpFunctions.checkNull(cpuStats.get("SwapTotal"))).replace("\"", ""));
            t4.setSwapFree((HelpFunctions.checkNull(cpuStats.get("SwapFree"))).replace("\"", ""));
            t4.setDirty((HelpFunctions.checkNull(cpuStats.get("Dirty"))).replace("\"", ""));
            t4.setWriteback((HelpFunctions.checkNull(cpuStats.get("Writeback"))).replace("\"", ""));
            t4.setAnonPages((HelpFunctions.checkNull(cpuStats.get("AnonPages"))).replace("\"", ""));
            t4.setMapped((HelpFunctions.checkNull(cpuStats.get("Mapped"))).replace("\"", ""));
            t4.setShmem((HelpFunctions.checkNull(cpuStats.get("Shmem"))).replace("\"", ""));
            t4.setSlab((HelpFunctions.checkNull(cpuStats.get("Slab"))).replace("\"", ""));
            t4.setsReclaimable((HelpFunctions.checkNull(cpuStats.get("SReclaimable"))).replace("\"", ""));
            t4.setsUnreclaim((HelpFunctions.checkNull(cpuStats.get("SUnreclaim"))).replace("\"", ""));
            t4.setKernelStack((HelpFunctions.checkNull(cpuStats.get("KernelStack"))).replace("\"", ""));
            t4.setPageTables((HelpFunctions.checkNull(cpuStats.get("PageTables"))).replace("\"", ""));
            t4.setCommitLimit((HelpFunctions.checkNull(cpuStats.get("CommitLimit"))).replace("\"", ""));
            t4.setCommittedAS((HelpFunctions.checkNull(cpuStats.get("Committed_AS"))).replace("\"", ""));
            t4.setVmallocTotal((HelpFunctions.checkNull(cpuStats.get("VmallocTotal"))).replace("\"", ""));
            t4.setVmallocUsed((HelpFunctions.checkNull(cpuStats.get("VmallocUsed"))).replace("\"", ""));
            t4.setVmallocChunk((HelpFunctions.checkNull(cpuStats.get("VmallocChunk"))).replace("\"", ""));


        }

        if (!HelpFunctions.checkNull(json.getAsJsonObject("other_cpu_info")).equals("NULL")) {
            JsonObject other_cpu = json.getAsJsonObject("other_cpu_info");

            t4.setTotUser((HelpFunctions.checkNull(other_cpu.get("tot_user"))).replace("\"", ""));
            t4.setTotNice((HelpFunctions.checkNull(other_cpu.get("tot_nice"))).replace("\"", ""));
            t4.setTotSystem((HelpFunctions.checkNull(other_cpu.get("tot_system"))).replace("\"", ""));
            t4.setTotIdle((HelpFunctions.checkNull(other_cpu.get("tot_idle"))).replace("\"", ""));
            t4.setTotIowait((HelpFunctions.checkNull(other_cpu.get("tot_iowait"))).replace("\"", ""));
            t4.setTotIrq((HelpFunctions.checkNull(other_cpu.get("tot_irq"))).replace("\"", ""));
            t4.setTotSoftirq((HelpFunctions.checkNull(other_cpu.get("tot_softirq"))).replace("\"", ""));
            t4.setCtxt((HelpFunctions.checkNull(other_cpu.get("ctxt"))).replace("\"", ""));
            t4.setBtime((HelpFunctions.checkNull(other_cpu.get("btime"))).replace("\"", ""));
            t4.setProcesses((HelpFunctions.checkNull(other_cpu.get("processes"))).replace("\"", ""));
            t4.setProcsRunning((HelpFunctions.checkNull(other_cpu.get("procs_running"))).replace("\"", ""));
            t4.setProcsBlocked((HelpFunctions.checkNull(other_cpu.get("procs_blocked"))).replace("\"", ""));

        }

        if (!HelpFunctions.checkNull(json.getAsJsonObject("interrupts")).equals("NULL")) {
            JsonObject Interrupts = json.getAsJsonObject("interrupts");

            t4.setMsmgpioCpu0((HelpFunctions.checkNull(Interrupts.get("msmgpio_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setMsmgpioSumCpu123((HelpFunctions.checkNull(Interrupts.get("msmgpio_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setWcd9xxxCpu0((HelpFunctions.checkNull(Interrupts.get("wcd9xxx_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setWcd9xxxSumCpu123((HelpFunctions.checkNull(Interrupts.get("wcd9xxx_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setPn547Cpu0((HelpFunctions.checkNull(Interrupts.get("pn547_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setPn547SumCpu123((HelpFunctions.checkNull(Interrupts.get("pn547_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setCypressTouchkeyCpu0((HelpFunctions.checkNull(Interrupts.get("cypress_touchkey_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setCypressTouchkeySumCpu123((HelpFunctions.checkNull(Interrupts.get("cypress_touchkey_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setSynapticsRmi4I2cCpu0((HelpFunctions.checkNull(Interrupts.get("synaptics_rmi4_i2c_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setSynapticsRmi4I2cSumCpu123((HelpFunctions.checkNull(Interrupts.get("synaptics_rmi4_i2c_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setSecHeadsetDetectCpu0((HelpFunctions.checkNull(Interrupts.get("sec_headset_detect_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setSecHeadsetDetectSumCpu123((HelpFunctions.checkNull(Interrupts.get("sec_headset_detect_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setFlipCoverCpu0((HelpFunctions.checkNull(Interrupts.get("flip_cover_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setFlipCoverSumCpu123((HelpFunctions.checkNull(Interrupts.get("flip_cover_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setHomeKeyCpu0((HelpFunctions.checkNull(Interrupts.get("home_key_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setHomeKeySumCpu123((HelpFunctions.checkNull(Interrupts.get("home_key_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setVolumeDownCpu0((HelpFunctions.checkNull(Interrupts.get("volume_down_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setVolumeDownSumCpu123((HelpFunctions.checkNull(Interrupts.get("volume_down_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setVolumeUpCpu0((HelpFunctions.checkNull(Interrupts.get("volume_up_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setVolumeUpSumCpu123((HelpFunctions.checkNull(Interrupts.get("volume_up_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setCompanionCpu0((HelpFunctions.checkNull(Interrupts.get("companion_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setCompanionSumCpu123((HelpFunctions.checkNull(Interrupts.get("companion_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setsLIMBUSCpu0((HelpFunctions.checkNull(Interrupts.get("SLIMBUS_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setsLIMBUSSumCpu123((HelpFunctions.checkNull(Interrupts.get("SLIMBUS_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setFunctionCallInterruptsCpu0((HelpFunctions.checkNull(Interrupts.get("function_call_interrupts_cpu0"))).replace("null", "NULL").replace("\"", ""));
            t4.setFunctionCallInterruptsSumCpu123((HelpFunctions.checkNull(Interrupts.get("function_call_interrupts_sum_cpu123"))).replace("null", "NULL").replace("\"", ""));
            t4.setCpu123IntrPrs((HelpFunctions.checkNull(Interrupts.get("cpu123_intr_prs"))).replace("null", "NULL").replace("\"", ""));
        }

        if (!HelpFunctions.checkNull(json.getAsJsonObject("storageData")).equals("NULL")) {
            JsonObject StorageData = json.getAsJsonObject("storageData");

            t4.setInternalAvailableBlocks(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("Internal_AvailableBlocks")).replace("\"", ""));
            t4.setInternalBlockCount(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("Internal_BlockCount")).replace("\"", ""));
            t4.setInternalFreeBlocks(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("Internal_FreeBlocks")).replace("\"", ""));
            t4.setInternalBlockSize(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("Internal_BlockSize")).replace("\"", ""));
            t4.setInternalAvailableBytes(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("Internal_AvailableBytes")).replace("\"", ""));
            t4.setInternalFreeBytes(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("Internal_FreeBytes")).replace("\"", ""));
            t4.setInternalTotalBytes(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("Internal_TotalBytes")).replace("\"", ""));
            t4.setExternalAvailableBlocks(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("External_AvailableBlocks")).replace("\"", ""));
            t4.setExternalBlockCount(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("External_BlockCount")).replace("\"", ""));
            t4.setExternalFreeBlocks(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("External_FreeBlocks")).replace("\"", ""));
            t4.setExternalBlockSize(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("External_BlockSize")).replace("\"", ""));
            t4.setExternalAvailableBytes(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("External_AvailableBytes")).replace("\"", ""));
            t4.setExternalFreeBytes(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("External_FreeBytes")).replace("\"", ""));
            t4.setExternalTotalBytes(HelpFunctions.checkNull(StorageData.getAsJsonObject().get("External_TotalBytes")).replace("\"", ""));
        }

        t4.setTrafficMobileRxBytes(HelpFunctions.checkNull(json.get("MobileRxBytes")));
        t4.setTrafficMobileRxPackets(HelpFunctions.checkNull(json.get("MobileRxPackets")));
        t4.setTrafficMobileTxBytes(HelpFunctions.checkNull(json.get("MobileTxBytes")));
        t4.setTrafficMobileTxPackets(HelpFunctions.checkNull(json.get("MobileTxPackets")));
        t4.setTrafficTotalRxBytes(HelpFunctions.checkNull(json.get("TotalRxBytes")));
        t4.setTrafficTotalRxPackets(HelpFunctions.checkNull(json.get("TotalRxPackets")));
        t4.setTrafficTotalTxBytes(HelpFunctions.checkNull(json.get("TotalTxBytes")));
        t4.setTrafficTotalTxPackets(HelpFunctions.checkNull(json.get("TotalTxPackets")));
        t4.setTrafficTotalWifiRxBytes(HelpFunctions.checkNull(json.get("TotalWifiRxBytes")));
        t4.setTrafficTotalWifiRxPackets(HelpFunctions.checkNull(json.get("TotalWifiRxPackets")));
        t4.setTrafficTotalWifiTxBytes(HelpFunctions.checkNull(json.get("TotalWifiTxBytes")));
        t4.setTrafficTotalWifiTxPackets(HelpFunctions.checkNull(json.get("TotalWifiTxPackets")));
        String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "");
        t4.setTrafficTimestamp(HelpFunctions.calcTimeStamp(StringTime));
        t4.setTrafficTotalWifiTxPackets(HelpFunctions.checkNull(json.get("TotalWifiTxPackets")));
        JsonArray procTraffic = json.getAsJsonArray("ProcTraffic");
        t4.setConnectedWifiSSID(HelpFunctions.checkNull(json.get("connectedWifi_SSID")).replace("\"", ""));
        t4.setConnectedWifiLevel(HelpFunctions.checkNull(json.get("connectedWifi_Level")).replace("\"", ""));


        applicationInsert(procTraffic, uuid, userName, version);

    }


    private void applicationInsert(JsonArray procTraffic, String uuid, String userName, String version) {

        for (JsonElement jsonEle : procTraffic) {

            JsonObject json = jsonEle.getAsJsonObject();
            Application application = new Application(json.get("pid").toString(), userName, uuid);

            application.setApplicationName(HelpFunctions.checkNull(json.get("ApplicationName")).replace("\"", ""));
            application.setCpuUsage(HelpFunctions.checkNull(json.get("CPU_USAGE")));
            application.setPackageName(HelpFunctions.checkNull(json.get("PackageName")).replace("\"", ""));
            application.setPackageUID(HelpFunctions.checkNull(json.get("PackageUID")));
            application.setUidRxBytes(HelpFunctions.checkNull(json.get("UidRxBytes")));
            application.setUidRxPackets(HelpFunctions.checkNull(json.get("UidRxPackets")));
            application.setUidTxBytes(HelpFunctions.checkNull(json.get("UidTxBytes")));
            application.setUidTxPackets(HelpFunctions.checkNull(json.get("UidTxPackets")));
            application.setVersionCode(HelpFunctions.checkNull(json.get("Version_Code")));
            application.setVersionName(HelpFunctions.checkNull(json.get("Version_Name")).replace("\"", ""));
            application.setCguestTime(HelpFunctions.checkNull(json.get("cguest_time")));
            application.setCmajFlt(HelpFunctions.checkNull(json.get("cmaj_flt")));
            application.setCstime(HelpFunctions.checkNull(json.get("cstime")));
            application.setCutime(HelpFunctions.checkNull(json.get("cutime")));
            application.setDalvikPrivateDirty(HelpFunctions.checkNull(json.get("dalvikPrivateDirty")));
            application.setDalvikPss(HelpFunctions.checkNull(json.get("dalvikPss")));
            application.setDalvikSharedDirty(HelpFunctions.checkNull(json.get("dalvikSharedDirty")));
            application.setGuestTime(HelpFunctions.checkNull(json.get("guest_time")));
            application.setImportance(HelpFunctions.checkNull(json.get("importance")));
            application.setImportanceReasonCode(HelpFunctions.checkNull(json.get("importanceReasonCode")));
            application.setImportanceReasonPid(HelpFunctions.checkNull(json.get("importanceReasonPid")));
            application.setLru(HelpFunctions.checkNull(json.get("lru")));
            application.setNativePrivateDirty(HelpFunctions.checkNull(json.get("nativePrivateDirty")));
            application.setNativePss(HelpFunctions.checkNull(json.get("nativePss")));
            application.setNativeSharedDirty(HelpFunctions.checkNull(json.get("nativeSharedDirty")));
            application.setNumThreads(HelpFunctions.checkNull(json.get("num_threads")));
            application.setOtherPrivateDirty(HelpFunctions.checkNull(json.get("otherPrivateDirty")));
            application.setOtherPss(HelpFunctions.checkNull(json.get("otherPss")));
            application.setOtherSharedDirty(HelpFunctions.checkNull(json.get("otherSharedDirty")));
            application.setPgid(HelpFunctions.checkNull(json.get("pgid")));
            application.setPpid(HelpFunctions.checkNull(json.get("ppid")));
            application.setPriority(HelpFunctions.checkNull(json.get("priority")));
            application.setRss(HelpFunctions.checkNull(json.get("rss")));
            application.setRsslim(HelpFunctions.checkNull(json.get("rsslim")));
            application.setSid(HelpFunctions.checkNull(json.get("sid")));
            application.setStartTime(HelpFunctions.checkNull(json.get("start_time")).replace("\"", ""));
            application.setState(HelpFunctions.checkNull(json.get("state")).replace("\"", ""));
            application.setStime(HelpFunctions.checkNull(json.get("stime")));
            application.setTcomm(HelpFunctions.checkNull(json.get("tcomm")).replace("\"", ""));
            application.setUtime(HelpFunctions.checkNull(json.get("utime")));
            application.setVsize(HelpFunctions.checkNull(json.get("vsize")));
            application.setSherlockVersion(version);
            application.setTgpid(HelpFunctions.checkNull(json.get("tgpid")).replace("\"", ""));
            application.setFlags(HelpFunctions.checkNull(json.get("flags")).replace("\"", ""));
            application.setWchan(HelpFunctions.checkNull(json.get("wchan")).replace("\"", ""));
            application.setExitSignal(HelpFunctions.checkNull(json.get("exit_signal")).replace("\"", ""));
//                application.setDelayacctBlkioTicks(HelpFunctions.checkNull(json.get("delayacct_blkio_ticks")).replace("\"", ""));
            application.setMinflt(HelpFunctions.checkNull(json.get("minflt")).replace("\"", ""));
            application.setCminflt(HelpFunctions.checkNull(json.get("cminflt")).replace("\"", ""));
            application.setMajflt(HelpFunctions.checkNull(json.get("majflt")).replace("\"", ""));
            application.setStartcode(HelpFunctions.checkNull(json.get("startcode")).replace("\"", ""));
            application.setEndcode(HelpFunctions.checkNull(json.get("endcode")).replace("\"", ""));
//                application.setStartstack(HelpFunctions.checkNull(json.get("startstack")).replace("\"", ""));
//                application.setKstkesp(HelpFunctions.checkNull(json.get("kstkesp")).replace("\"", ""));
//                application.setKstkeip(HelpFunctions.checkNull(json.get("kstkeip")).replace("\"", ""));
//                application.setNswap(HelpFunctions.checkNull(json.get("nswap")).replace("\"", ""));
//                application.setCnswap(HelpFunctions.checkNull(json.get("cnswap")).replace("\"", ""));
            application.setNice(HelpFunctions.checkNull(json.get("nice")).replace("\"", ""));
            application.setItrealvalue(HelpFunctions.checkNull(json.get("itrealvalue")).replace("\"", ""));
            application.setProcessor(HelpFunctions.checkNull(json.get("processor")).replace("\"", ""));
            application.setRtPriority(HelpFunctions.checkNull(json.get("rt_priority")).replace("\"", ""));


            tableHashMaps[Dao._APPLICATION].put(application.hashCode(), application);
            //applicationQueue.add(application);

        }
    }


}

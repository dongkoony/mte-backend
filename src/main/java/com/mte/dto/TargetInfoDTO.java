package com.mte.dto;

import lombok.Data;

@Data
public class TargetInfoDTO {
    private String ip_addr;
    private String hostname;

    private String os_name;
    private String os_version;
    private String cpu_vendor;
    private String cpu_model;
    private String cpu_mhz;
    private String cpu_core;
    private String cpu_v_core;
    private String cpu_socket;
    private String cpu_hyper_threading_yn;
    private String memory_size;
    private String volume_size;

    public String getIp_addr() {
        return ip_addr;
    }

    public void setIp_addr(String ip_addr) {
        this.ip_addr = ip_addr;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getOs_name() {
        return os_name;
    }

    public void setOs_name(String os_name) {
        this.os_name = os_name;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getCpu_vendor() {
        return cpu_vendor;
    }

    public void setCpu_vendor(String cpu_vendor) {
        this.cpu_vendor = cpu_vendor;
    }

    public String getCpu_model() {
        return cpu_model;
    }

    public void setCpu_model(String cpu_model) {
        this.cpu_model = cpu_model;
    }

    public String getCpu_mhz() {
        return cpu_mhz;
    }

    public void setCpu_mhz(String cpu_mhz) {
        this.cpu_mhz = cpu_mhz;
    }

    public String getCpu_core() {
        return cpu_core;
    }

    public void setCpu_core(String cpu_core) {
        this.cpu_core = cpu_core;
    }

    public String getCpu_v_core() {
        return cpu_v_core;
    }

    public void setCpu_v_core(String cpu_v_core) {
        this.cpu_v_core = cpu_v_core;
    }

    public String getCpu_socket() {
        return cpu_socket;
    }

    public void setCpu_socket(String cpu_socket) {
        this.cpu_socket = cpu_socket;
    }

    public String getCpu_hyper_threading_yn() {
        return cpu_hyper_threading_yn;
    }

    public void setCpu_hyper_threading_yn(String cpu_hyper_threading_yn) {
        this.cpu_hyper_threading_yn = cpu_hyper_threading_yn;
    }

    public String getMemory_size() {
        return memory_size;
    }

    public void setMemory_size(String memory_size) {
        this.memory_size = memory_size;
    }

    public String getVolume_size() {
        return volume_size;
    }

    public void setVolume_size(String volume_size) {
        this.volume_size = volume_size;
    }
}

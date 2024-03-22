package com.agro.agro_project.dto;

import com.agro.agro_project.domain.Implement;
import com.agro.agro_project.domain.MachineTask;

public class MachineTaskImplementDTO {
    private MachineTask machineTask;

    private Implement implement;

    public MachineTaskImplementDTO(MachineTask machineTask, Implement implement) {
        this.machineTask = machineTask;
        this.implement = implement;
    }

    public MachineTaskImplementDTO() {
    }

    public MachineTask getMachineTask() {
        return machineTask;
    }

    public void setMachineTask(MachineTask machineTask) {
        this.machineTask = machineTask;
    }

    public Implement getImplement() {
        return implement;
    }

    public void setImplement(Implement implement) {
        this.implement = implement;
    }
}

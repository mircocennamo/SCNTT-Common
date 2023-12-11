package it.nsis.viewmodel;

import it.nsis.model.Rilevazione;

import java.io.Serializable;

/**
 * @author mirco.cennamo on 11/12/2023
 * @project SCNTT-Consumer
 */

public record RilevazioneRequestVm(String licensePlate, String latitude, String longitude ) implements Serializable {



    public static Rilevazione toModel(RilevazioneRequestVm rilevazioneRequestVm) {
        Rilevazione rilevazione = new Rilevazione();
        rilevazione.setLatitude(rilevazioneRequestVm.latitude());
        rilevazione.setLongitude(rilevazioneRequestVm.longitude());
        rilevazione.setLicensePlate(rilevazioneRequestVm.licensePlate());
        return rilevazione;
    }
}

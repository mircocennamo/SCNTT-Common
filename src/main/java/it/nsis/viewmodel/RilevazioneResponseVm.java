package it.nsis.viewmodel;

import it.nsis.model.Rilevazione;

import java.io.Serializable;

/**
 * @author mirco.cennamo on 11/12/2023
 * @project SCNTT-Consumer
 */

public record RilevazioneResponseVm(String uuid, String licensePlate, String latitude, String longitude )  implements Serializable {


    public static RilevazioneResponseVm fromModel(Rilevazione rilevazione) {
        return new RilevazioneResponseVm(rilevazione.getUuid().toString(),rilevazione.getLicensePlate(),
                rilevazione.getLatitude(),rilevazione.getLongitude());
    }


}

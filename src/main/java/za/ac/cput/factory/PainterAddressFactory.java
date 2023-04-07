package za.ac.cput.factory;

import za.ac.cput.domain.PainterAddress;
import za.ac.cput.util.Helper;

public class PainterAddressFactory {
    public static PainterAddress createPainterAddress(String painterId, String addressId) {
        if (Helper.isNullOrEmpty(painterId) || Helper.isNullOrEmpty(addressId)) {
            return null;
        }

        String painterAddressId = Helper.generateId();


        PainterAddress painterAddress = new PainterAddress.Builder()
                .setPainterAddressId(painterAddressId)
                .setAddressId(addressId)
                .setPainterId(painterId)
                .build();

        return painterAddress;


    }
}

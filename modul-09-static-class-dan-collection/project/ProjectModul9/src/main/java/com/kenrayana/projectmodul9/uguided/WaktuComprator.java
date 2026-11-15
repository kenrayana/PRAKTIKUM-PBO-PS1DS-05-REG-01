package com.kenrayana.projectmodul9.uguided;

import java.util.Comparator;

public class WaktuComprator implements Comparator<HasilEksperimen> {
    // Urutan: waktu training tercepat -> terlama
    @Override
    public int compare(HasilEksperimen e1, HasilEksperimen e2) {
        return Integer.compare(e1.getWaktuTraining(), e2.getWaktuTraining());
    }
}

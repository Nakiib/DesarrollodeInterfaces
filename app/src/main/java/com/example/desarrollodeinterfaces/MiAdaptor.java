package com.example.desarrollodeinterfaces;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MiAdaptor extends FragmentStateAdapter {
    public MiAdaptor(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                TemasFragment temasFragment = new TemasFragment();
                return temasFragment;
            case 1:
                BuscarFragment buscarFragment = new BuscarFragment();
                return buscarFragment;
            case 2:
                SubirFragment subirFragment = new SubirFragment();
                return subirFragment;
            case 3:
                PerfilFragment perfilFragment = new PerfilFragment();
                return perfilFragment;
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public CharSequence getTabTitle(int position){
        switch (position){
            case 0:
                return "TEMAS";
            case 1:
                return "BUSCAR";
            case 2:
                return "SUBIR";
            case 3:
                return "PERFIL";
            default:
                return "PRUEBA";
        }
    }
}

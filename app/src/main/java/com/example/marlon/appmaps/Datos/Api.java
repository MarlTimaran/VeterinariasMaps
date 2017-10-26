package com.example.marlon.appmaps.Datos;

import com.example.marlon.appmaps.Modelos.Veterinaria;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by marlon on 26/10/17.
 */

public interface Api {
    @GET("9n8c-kkfd.json")
    Call<List<Veterinaria>> obtenerListaVeterinaria();
}

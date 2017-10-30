package edu.tecsup.jeferson.almacenapp.services;

import java.util.List;

import edu.tecsup.jeferson.almacenapp.models.Producto;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Alumno on 10/30/2017.
 */

public interface ApiService {

    String API_BASE_URL = "https://almacen-jeferson-0512.cs50.io";

    @GET("/api/v1/productos")
    Call<List<Producto>> getProductos();


}

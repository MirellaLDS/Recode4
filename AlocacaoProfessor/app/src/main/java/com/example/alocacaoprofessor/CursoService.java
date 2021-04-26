package com.example.alocacaoprofessor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CursoService {

    @GET("course")
    Call<List<Curso>> getCursos();

}

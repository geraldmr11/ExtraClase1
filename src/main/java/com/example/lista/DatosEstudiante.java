package com.example.lista;

/**
 *
 *
 */
public class DatosEstudiante {

    private int Carne;
    private String NombreApellidos;
    private String Correo;
    private int telefono;
    private String Nickname;
    private String TipoEstudiante;
    private int NotaExamenes;
    private int NotaQuices;
    private int NotaTareas;
    private int NotaProyecto1;
    private int NotaProyecto2;
    private int NotaProyecto3;



    public DatosEstudiante(int carne, String nombreApellidos, String correo,int telefono, String nickname, String tipoEstudiante, int notaExamenes, int notaQuices, int notaTareas, int notaProyecto1, int notaProyecto2, int notaProyecto3) {
        this.Carne = carne;
        this.NombreApellidos = nombreApellidos;
        this.Correo = correo;
        this.telefono = telefono;
        this.Nickname = nickname;
        this.TipoEstudiante = tipoEstudiante;
        this.NotaExamenes = notaExamenes;
        this.NotaQuices = notaQuices;
        this.NotaTareas = notaTareas;
        this.NotaProyecto1 = notaProyecto1;
        this.NotaProyecto2 = notaProyecto2;
        this.NotaProyecto3 = notaProyecto3;
    }

    public int getCarne() {
        return Carne;
    }

    public void setCarne(int carne) {
        this.Carne = Carne;
    }

    public String getNombreApellidos() {
        return NombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.NombreApellidos = nombreApellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getTipoEstudiante() {
        return TipoEstudiante;
    }

    public void setTipoEstudiante(String tipoEstudiante) {
        TipoEstudiante = tipoEstudiante;
    }

    public int getNotaExamenes() {
        return NotaExamenes;
    }

    public void setNotaExamenes(int notaExamenes) {
        NotaExamenes = notaExamenes;
    }

    public int getNotaQuices() {
        return NotaQuices;
    }

    public void setNotaQuices(int notaQuices) {
        NotaQuices = notaQuices;
    }

    public int getNotaTareas() {
        return NotaTareas;
    }

    public void setNotaTareas(int notaTareas) {
        NotaTareas = notaTareas;
    }

    public int getNotaProyecto1() {
        return NotaProyecto1;
    }

    public void setNotaProyecto1(int notaProyecto1) {
        NotaProyecto1 = notaProyecto1;
    }

    public int getNotaProyecto2() {
        return NotaProyecto2;
    }

    public void setNotaProyecto2(int notaProyecto2) {
        NotaProyecto2 = notaProyecto2;
    }

    public int getNotaProyecto3() {
        return NotaProyecto3;
    }

    public void setNotaProyecto3(int notaProyecto3) {
        NotaProyecto3 = notaProyecto3;
    }
}

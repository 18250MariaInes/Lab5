package com.example.maria.lab5

class contact (
    //atributos que deben poseer
    private val nombre:String,
    private val telefono: String,
    private val correo:String

){//getter de los atributos
fun getnombre():String{
    return nombre
}//metodo para al ser impreso en la lista solo muestra su nombre
    override fun toString():String{
        return this.nombre
    }
    fun getcorreo():String{
        return correo
    }
    fun gettelefono():String{
        return telefono
    }


}
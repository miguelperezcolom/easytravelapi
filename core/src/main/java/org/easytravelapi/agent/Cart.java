package org.easytravelapi.agent;

import org.easytravelapi.activity.PaymentMethod;

public class Cart {
    private String precio;

    private String img;

    private String qty;

    private String id;

    private String nombre;

    private String nombreHtml;

    private String qrCode;

    private String groupReference;


    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreHtml() {
        return nombreHtml;
    }

    public void setNombreHtml(String nombreHtml) {
        this.nombreHtml = nombreHtml;
    }

    public String getQrCode() {return qrCode; }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getGroupReference() { return groupReference; }

    public void setGroupReference(String groupReference) { this.groupReference = groupReference; }
}

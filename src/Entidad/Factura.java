/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Jandr
 */
public class Factura {
    private int ID_FACTURA;
    private String CODIGO;
    private String CLAVE_ACCESO;
    private String N_O;
    private Date FECHA_EMISION = new Date();
    private String FECHA_E;
    private String GUIA_REMISION1;
    private String GUIA_REMISION2;
    private String GUIA_REMISION3;
    private boolean CONSUMIDOR_FINAL = true;;
    private boolean RUC_CI_PASAPORTE;
    private String RUC_CI_PASAPORTE_S ="0999999999";
    private String RAZONSOCIAL_APELLIDOSNOMBRES ="0999999999";
    private String DIRECCION_COMPRADOR ="0999999999";
    private double SUBTOTAL_SIN_IMPUESTOS;
    private double SUBTOTAL_12;
    private double SUBTOTAL_0;
    private double SUBTOTAL_NO_OBJETO_IVA;
    private double SUBTOTAL_EXENTO_IVA;
    private double TOTAL_DESCUENTO;
    private double VALOR_ICE;
    private double IVA_12;
    private double VALOR_IRBPNR;
    private boolean PROPINA_B = true;
    private double PROPINA;
    private double TOTAL_FACTURA;
    private double VALOR_TOTAL_SIN_SUBSIDIO;
    private double AHORRO_POR_SUBSIDIO;
    private boolean ESTADO;
    private int ID_USUARIO;

    private String RUC_E;
    private String NOMBRE_COMERCIAL_E;
    private String RAZON_SOCIAL_APELLIDOS_NOMBRES_E;

    private String CONTRIB_ESPECIAL_E;
    private String OBL_LLEVAR_CONTAB_E;
    private String DIRECCION_MATRIZ_E;
    private String DIRECN_ESTABLECI;

    public Factura() {
    }

    public int getID_FACTURA() {
        return ID_FACTURA;
    }

    public void setID_FACTURA(int ID_FACTURA) {
        this.ID_FACTURA = ID_FACTURA;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getCLAVE_ACCESO() {
        return CLAVE_ACCESO;
    }

    public void setCLAVE_ACCESO(String CLAVE_ACCESO) {
        this.CLAVE_ACCESO = CLAVE_ACCESO;
    }

    public String getN_O() {
        return N_O;
    }

    public void setN_O(String N_O) {
        this.N_O = N_O;
    }

    public Date getFECHA_EMISION() {
        return FECHA_EMISION;
    }

    public void setFECHA_EMISION(Date FECHA_EMISION) {
        this.FECHA_EMISION = FECHA_EMISION;
    }

    public String getFECHA_E() {
        return FECHA_E;
    }

    public void setFECHA_E(String FECHA_E) {
        this.FECHA_E = FECHA_E;
    }

    public String getGUIA_REMISION1() {
        return GUIA_REMISION1;
    }

    public void setGUIA_REMISION1(String GUIA_REMISION1) {
        this.GUIA_REMISION1 = GUIA_REMISION1;
    }

    public String getGUIA_REMISION2() {
        return GUIA_REMISION2;
    }

    public void setGUIA_REMISION2(String GUIA_REMISION2) {
        this.GUIA_REMISION2 = GUIA_REMISION2;
    }

    public String getGUIA_REMISION3() {
        return GUIA_REMISION3;
    }

    public void setGUIA_REMISION3(String GUIA_REMISION3) {
        this.GUIA_REMISION3 = GUIA_REMISION3;
    }

    public boolean isCONSUMIDOR_FINAL() {
        return CONSUMIDOR_FINAL;
    }

    public void setCONSUMIDOR_FINAL(boolean CONSUMIDOR_FINAL) {
        this.CONSUMIDOR_FINAL = CONSUMIDOR_FINAL;
    }

    public boolean isRUC_CI_PASAPORTE() {
        return RUC_CI_PASAPORTE;
    }

    public void setRUC_CI_PASAPORTE(boolean RUC_CI_PASAPORTE) {
        this.RUC_CI_PASAPORTE = RUC_CI_PASAPORTE;
    }

    public String getRUC_CI_PASAPORTE_S() {
        return RUC_CI_PASAPORTE_S;
    }

    public void setRUC_CI_PASAPORTE_S(String RUC_CI_PASAPORTE_S) {
        this.RUC_CI_PASAPORTE_S = RUC_CI_PASAPORTE_S;
    }

    public String getRAZONSOCIAL_APELLIDOSNOMBRES() {
        return RAZONSOCIAL_APELLIDOSNOMBRES;
    }

    public void setRAZONSOCIAL_APELLIDOSNOMBRES(String RAZONSOCIAL_APELLIDOSNOMBRES) {
        this.RAZONSOCIAL_APELLIDOSNOMBRES = RAZONSOCIAL_APELLIDOSNOMBRES;
    }

    public String getDIRECCION_COMPRADOR() {
        return DIRECCION_COMPRADOR;
    }

    public void setDIRECCION_COMPRADOR(String DIRECCION_COMPRADOR) {
        this.DIRECCION_COMPRADOR = DIRECCION_COMPRADOR;
    }

    public double getSUBTOTAL_SIN_IMPUESTOS() {
        return SUBTOTAL_SIN_IMPUESTOS;
    }

    public void setSUBTOTAL_SIN_IMPUESTOS(double SUBTOTAL_SIN_IMPUESTOS) {
        this.SUBTOTAL_SIN_IMPUESTOS = SUBTOTAL_SIN_IMPUESTOS;
    }

    public double getSUBTOTAL_12() {
        return SUBTOTAL_12;
    }

    public void setSUBTOTAL_12(double SUBTOTAL_12) {
        this.SUBTOTAL_12 = SUBTOTAL_12;
    }

    public double getSUBTOTAL_0() {
        return SUBTOTAL_0;
    }

    public void setSUBTOTAL_0(double SUBTOTAL_0) {
        this.SUBTOTAL_0 = SUBTOTAL_0;
    }

    public double getSUBTOTAL_NO_OBJETO_IVA() {
        return SUBTOTAL_NO_OBJETO_IVA;
    }

    public void setSUBTOTAL_NO_OBJETO_IVA(double SUBTOTAL_NO_OBJETO_IVA) {
        this.SUBTOTAL_NO_OBJETO_IVA = SUBTOTAL_NO_OBJETO_IVA;
    }

    public double getSUBTOTAL_EXENTO_IVA() {
        return SUBTOTAL_EXENTO_IVA;
    }

    public void setSUBTOTAL_EXENTO_IVA(double SUBTOTAL_EXENTO_IVA) {
        this.SUBTOTAL_EXENTO_IVA = SUBTOTAL_EXENTO_IVA;
    }

    public double getTOTAL_DESCUENTO() {
        return TOTAL_DESCUENTO;
    }

    public void setTOTAL_DESCUENTO(double TOTAL_DESCUENTO) {
        this.TOTAL_DESCUENTO = TOTAL_DESCUENTO;
    }

    public double getVALOR_ICE() {
        return VALOR_ICE;
    }

    public void setVALOR_ICE(double VALOR_ICE) {
        this.VALOR_ICE = VALOR_ICE;
    }

    public double getIVA_12() {
        return IVA_12;
    }

    public void setIVA_12(double IVA_12) {
        this.IVA_12 = IVA_12;
    }

    public double getVALOR_IRBPNR() {
        return VALOR_IRBPNR;
    }

    public void setVALOR_IRBPNR(double VALOR_IRBPNR) {
        this.VALOR_IRBPNR = VALOR_IRBPNR;
    }

    public boolean isPROPINA_B() {
        return PROPINA_B;
    }

    public void setPROPINA_B(boolean PROPINA_B) {
        this.PROPINA_B = PROPINA_B;
    }

    public double getPROPINA() {
        return PROPINA;
    }

    public void setPROPINA(double PROPINA) {
        this.PROPINA = PROPINA;
    }

    public double getTOTAL_FACTURA() {
        return TOTAL_FACTURA;
    }

    public void setTOTAL_FACTURA(double TOTAL_FACTURA) {
        this.TOTAL_FACTURA = TOTAL_FACTURA;
    }

    public double getVALOR_TOTAL_SIN_SUBSIDIO() {
        return VALOR_TOTAL_SIN_SUBSIDIO;
    }

    public void setVALOR_TOTAL_SIN_SUBSIDIO(double VALOR_TOTAL_SIN_SUBSIDIO) {
        this.VALOR_TOTAL_SIN_SUBSIDIO = VALOR_TOTAL_SIN_SUBSIDIO;
    }

    public double getAHORRO_POR_SUBSIDIO() {
        return AHORRO_POR_SUBSIDIO;
    }

    public void setAHORRO_POR_SUBSIDIO(double AHORRO_POR_SUBSIDIO) {
        this.AHORRO_POR_SUBSIDIO = AHORRO_POR_SUBSIDIO;
    }

    public boolean isESTADO() {
        return ESTADO;
    }

    public void setESTADO(boolean ESTADO) {
        this.ESTADO = ESTADO;
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getRUC_E() {
        return RUC_E;
    }

    public void setRUC_E(String RUC_E) {
        this.RUC_E = RUC_E;
    }

    public String getNOMBRE_COMERCIAL_E() {
        return NOMBRE_COMERCIAL_E;
    }

    public void setNOMBRE_COMERCIAL_E(String NOMBRE_COMERCIAL_E) {
        this.NOMBRE_COMERCIAL_E = NOMBRE_COMERCIAL_E;
    }

    public String getRAZON_SOCIAL_APELLIDOS_NOMBRES_E() {
        return RAZON_SOCIAL_APELLIDOS_NOMBRES_E;
    }

    public void setRAZON_SOCIAL_APELLIDOS_NOMBRES_E(String RAZON_SOCIAL_APELLIDOS_NOMBRES_E) {
        this.RAZON_SOCIAL_APELLIDOS_NOMBRES_E = RAZON_SOCIAL_APELLIDOS_NOMBRES_E;
    }

    public String getCONTRIB_ESPECIAL_E() {
        return CONTRIB_ESPECIAL_E;
    }

    public void setCONTRIB_ESPECIAL_E(String CONTRIB_ESPECIAL_E) {
        this.CONTRIB_ESPECIAL_E = CONTRIB_ESPECIAL_E;
    }

    public String getOBL_LLEVAR_CONTAB_E() {
        return OBL_LLEVAR_CONTAB_E;
    }

    public void setOBL_LLEVAR_CONTAB_E(String OBL_LLEVAR_CONTAB_E) {
        this.OBL_LLEVAR_CONTAB_E = OBL_LLEVAR_CONTAB_E;
    }

    public String getDIRECCION_MATRIZ_E() {
        return DIRECCION_MATRIZ_E;
    }

    public void setDIRECCION_MATRIZ_E(String DIRECCION_MATRIZ_E) {
        this.DIRECCION_MATRIZ_E = DIRECCION_MATRIZ_E;
    }

    public String getDIRECN_ESTABLECI() {
        return DIRECN_ESTABLECI;
    }

    public void setDIRECN_ESTABLECI(String DIRECN_ESTABLECI) {
        this.DIRECN_ESTABLECI = DIRECN_ESTABLECI;
    }

    @Override
    public String toString() {
        return "Factura{" + "ID_FACTURA=" + ID_FACTURA + ", CODIGO=" + CODIGO + ", CLAVE_ACCESO=" + CLAVE_ACCESO + ", N_O=" + N_O + ", FECHA_EMISION=" + FECHA_EMISION + ", FECHA_E=" + FECHA_E + ", GUIA_REMISION1=" + GUIA_REMISION1 + ", GUIA_REMISION2=" + GUIA_REMISION2 + ", GUIA_REMISION3=" + GUIA_REMISION3 + ", CONSUMIDOR_FINAL=" + CONSUMIDOR_FINAL + ", RUC_CI_PASAPORTE=" + RUC_CI_PASAPORTE + ", RUC_CI_PASAPORTE_S=" + RUC_CI_PASAPORTE_S + ", RAZONSOCIAL_APELLIDOSNOMBRES=" + RAZONSOCIAL_APELLIDOSNOMBRES + ", DIRECCION_COMPRADOR=" + DIRECCION_COMPRADOR + ", SUBTOTAL_SIN_IMPUESTOS=" + SUBTOTAL_SIN_IMPUESTOS + ", SUBTOTAL_12=" + SUBTOTAL_12 + ", SUBTOTAL_0=" + SUBTOTAL_0 + ", SUBTOTAL_NO_OBJETO_IVA=" + SUBTOTAL_NO_OBJETO_IVA + ", SUBTOTAL_EXENTO_IVA=" + SUBTOTAL_EXENTO_IVA + ", TOTAL_DESCUENTO=" + TOTAL_DESCUENTO + ", VALOR_ICE=" + VALOR_ICE + ", IVA_12=" + IVA_12 + ", VALOR_IRBPNR=" + VALOR_IRBPNR + ", PROPINA_B=" + PROPINA_B + ", PROPINA=" + PROPINA + ", TOTAL_FACTURA=" + TOTAL_FACTURA + ", VALOR_TOTAL_SIN_SUBSIDIO=" + VALOR_TOTAL_SIN_SUBSIDIO + ", AHORRO_POR_SUBSIDIO=" + AHORRO_POR_SUBSIDIO + ", ESTADO=" + ESTADO + ", ID_USUARIO=" + ID_USUARIO + ", RUC_E=" + RUC_E + ", NOMBRE_COMERCIAL_E=" + NOMBRE_COMERCIAL_E + ", RAZON_SOCIAL_APELLIDOS_NOMBRES_E=" + RAZON_SOCIAL_APELLIDOS_NOMBRES_E + ", CONTRIB_ESPECIAL_E=" + CONTRIB_ESPECIAL_E + ", OBL_LLEVAR_CONTAB_E=" + OBL_LLEVAR_CONTAB_E + ", DIRECCION_MATRIZ_E=" + DIRECCION_MATRIZ_E + ", DIRECN_ESTABLECI=" + DIRECN_ESTABLECI + '}';
    }
    
    
}

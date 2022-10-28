package aula36.impressao.impressoras;

import aula36.impressao.IImpressora1;
import aula36.impressao.Imprimivel1;

public class IImpressora1Epson implements IImpressora1 {
    @Override
    public void imprimir(Imprimivel1 imprimivel1) {
        System.out.println("***************************************");
        System.out.println(imprimivel1.getCabelhoPagina());
        System.out.println("****************************************");
        System.out.println(imprimivel1.getCorpoPagina());
        System.out.println("*****************************************");
        System.out.println("***********    EPSON    *****************");
        System.out.println("*****************************************");
    }
}

package aula36.impressao.impressoras;

import aula36.impressao.IImpressora;
import aula36.impressao.Imprimivel;

public class IImpressoraEpson implements IImpressora {
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("***************************************");
        System.out.println(imprimivel.getCabelhoPagina());
        System.out.println("****************************************");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println("*****************************************");
        System.out.println("***********    EPSON    *****************");
        System.out.println("*****************************************");
    }
}

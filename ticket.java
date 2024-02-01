package com.example.ex2;

public class ticket {
    private int heureDep;
    private int mnDep;
    private int mmArr;
    private int heureArr;
    private int nbKms;
    private float prixKm;
    private int prixTicket;
    private int dureeTrajet;
    public ticket(int Depheure, int Depmn, int Arrmm, int Arrheure, int Kmsnb, float Kmprix){
        this.heureDep=Depheure;
        this.mnDep=Depmn;
        this.mmArr=Arrmm;
        this.heureArr=Arrheure;
        this.nbKms=Kmsnb;
        this.prixKm=Kmprix;
    }

    @Override
    public String toString() {
        return "ticket{" +
                "heureDep=" + heureDep +
                ", mnDep=" + mnDep +
                ", mmArr=" + mmArr +
                ", nbKms=" + nbKms +
                ", prixKm=" + prixKm +
                ", prixTicket=" + prixTicket +
                ", dureeTrajet=" + dureeTrajet +
                '}';
    }
    public void affiche() {
        System.out.println("Heure de départ: " + heureDep + ":" + mnDep);
        System.out.println("Heure d'arrivée: " + heureArr + ":" + mmArr);
        System.out.println("Nombre de kilomètres: " + nbKms);
        System.out.println("Durée du trajet: " + dureeTrajet + " minutes");
        System.out.println("Prix du ticket: " + prixTicket + " euros");
    }

    public void calculDuree() {
    if (mmArr-mnDep>=0){
        dureeTrajet = (heureArr - heureDep) * 60 + (mmArr - mnDep);
    }
    else{
        dureeTrajet = (heureArr - heureDep-1) * 60 + (60+mmArr - mnDep);
    }
    }

    public void calculPrix() {
        prixTicket = (int) (nbKms * prixKm);
    }

}


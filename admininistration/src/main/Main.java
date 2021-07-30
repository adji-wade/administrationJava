package main;

import sn.isi.entities.User;
import sn.isi.service.IUser;
import sn.isi.service.UserImple;

public class Main {
    public static void main(String[] args) {
        IUser user = new UserImple();
        User u = user.saisir();
        user.affichage(u);
    }
}

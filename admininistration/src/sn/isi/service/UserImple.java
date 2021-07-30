package sn.isi.service;

import sn.isi.entities.User;

import java.util.Scanner;

public class UserImple implements IUser {
    @Override
    public User saisir() {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.println("Entre l' id");
        user.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre votre nom");
        user.setNom(sc.nextLine());
        System.out.println("Entre votre prenom");
        user.setPrenom(sc.nextLine());
        System.out.println("Entre votre email");
        user.setEmail(sc.nextLine());
        System.out.println("Entre votre password");
        user.setPassword(sc.nextLine());
        System.out.println("Entre l'etat");
        user.setEtat(Integer.parseInt(sc.nextLine()));

        return user;
    }

    @Override
    public void affichage(User u) {
        System.out.println("l'identifiant est : "+u.getId());
        System.out.println("le nom est : "+u.getNom());
        System.out.println("le prenom est : "+u.getPrenom());
        System.out.println("l' email est : "+u.getEmail());
        System.out.println("le password  est : "+u.getPassword());
        System.out.println("l'etat est : "+u.getEtat());
    }
}

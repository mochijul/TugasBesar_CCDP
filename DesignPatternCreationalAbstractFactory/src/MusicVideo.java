/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hijul
 */
public class MusicVideo implements VideoFactory{

    @Override
    public Deskripsi createFieldDeskripsi() {
        return new MusicDeskripsi();
    }

    @Override
    public Video createFieldVideo() {
        return new Video();
    }

    @Override
    public Judul createFieldJudul() {
        return new Judul();
    }
 
}

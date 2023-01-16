import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.CinemaManager;

public class CinemaManagerTest {
    @Test
    public void testFindLastUnderLimit (){
        String film1 = "film I";
        String film2 = "film II";
        String film3 = "film III";

        CinemaManager manager = new CinemaManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = { "film III", "film II", "film I" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testFindLastOver (){
        String film1 = "film I";
        String film2 = "film II";
        String film3 = "film III";
        String film4 = "film IV";
        String film5 = "film V";
        String film6 = "film VI";
        String film7 = "film VII";
        String film8 = "film VIII";
        String film9 = "film IX";
        String film10 = "film X";
        String film11 = "film XI";

        CinemaManager manager = new CinemaManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] expected = {"film XI", "film X","film IX", "film VIII", "film VII", "film VI", "film V", "film IV","film III", "film II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void findAll (){
        String film1 = "film I";
        String film2 = "film II";
        String film3 = "film III";
        String film4 = "film IV";
        CinemaManager manager = new CinemaManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        String[] expected = { "film I", "film II", "film III", "film IV"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
}

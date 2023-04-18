package components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MovieFoneSearchComponent {

    public MovieFoneSearchComponent openPage() {
        open("https://www.moviefone.com/");
        return this;
    }

    public MovieFoneSearchComponent searchAFilm() {
        $("[placeholder='find it. watch it.']").setValue("Midsommar").pressEnter();
        $("[href='https://www.moviefone.com/movie/midsommar/qyjvUkNtWrcjpUh1dp58E/main/']").click();
        return this;
    }

    public MovieFoneSearchComponent CheckMaturityRating() {
        $(".movie-info-rating").shouldHave(Condition.exactText("R"));
        return this;
    }

    public MovieFoneSearchComponent CheckReleaseYear() {
        $(".movie-info-release-date").shouldHave(Condition.exactText("Jul 3rd, 2019"));
        return this;
    }

    public MovieFoneSearchComponent CheckDuration() {
        $(".movie-info-run-time").shouldHave(Condition.exactText("2 hr 27 min"));
        return this;
    }

}

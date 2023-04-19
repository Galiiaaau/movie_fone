package tests;

import components.MovieFoneSearchComponent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class MovieFone extends TestBase {

    MovieFoneSearchComponent movieFoneSearchComponent = new MovieFoneSearchComponent();

    @Test
    @Tag("remote")
    @DisplayName("Check specific movie's content")
    void MovieSearch() {

        step("Open movie website", () -> {
            movieFoneSearchComponent.openPage();
        });

        step("Search a specific film", () -> {
            movieFoneSearchComponent.searchAFilm();
        });

        step("Check the maturity rating", () -> {
            movieFoneSearchComponent.CheckMaturityRating();
        });

        step("Check the release year", () -> {
            movieFoneSearchComponent.CheckReleaseYear();
        });

        step("Check the duration of a movie", () -> {
            movieFoneSearchComponent.CheckDuration();
        });
    }


}

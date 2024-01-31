import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.mts.HW_5.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class MainTest {

    @Nested
    class EqualsTest {
        private final Wolf wolf1 = new Wolf("Wolf", BigDecimal.valueOf(10), "Gray wolf", "Angry", LocalDate.of(2004, 2, 26));
        private final Wolf wolf2 = new Wolf("Wolf", BigDecimal.valueOf(10), "Gray wolf", "Angry", LocalDate.of(2004, 2, 26));
        private final Wolf wolf3 = new Wolf("Wolf", BigDecimal.valueOf(10), "Gray wolf", "Angry", LocalDate.of(2004, 2, 26));

        @Test
        @DisplayName("Reflexivity")
        void testReflexiveEquals() {
            Assertions.assertEquals(wolf1, wolf1);
        }

        @Test
        @DisplayName("Symmetric")
        void testSymmetricEquals() {
            Assertions.assertEquals(wolf1, wolf2);
            Assertions.assertEquals(wolf2, wolf1);
        }

        @Test
        @DisplayName("Transitivity")
        void testTransitive() {
            Assertions.assertEquals(wolf1, wolf2);
            Assertions.assertEquals(wolf2, wolf3);
            Assertions.assertEquals(wolf1, wolf3);
        }

        @Test
        @DisplayName("Consistency")
        void testConsistent() {
            Assertions.assertEquals(wolf1, wolf2);
            Assertions.assertEquals(wolf1, wolf2);
        }

        @Test
        @DisplayName("Non-empty object")
        void testNullComparison() {
            Assertions.assertNotEquals(null, wolf1);
        }

    }

    @Nested
    class SearchServiceTest {
        SearchService searchService = new SearchServiceImpl();

        @Test
        @DisplayName("Leap year test")
        void testFindLeapYearNames() {
            Wolf leapYearWolf = new Wolf("Wolf1", BigDecimal.valueOf(10), "Gray wolf", LocalDate.of(2024, 1, 1));
            Wolf notLeapYearWolf = new Wolf("Wolf2", BigDecimal.valueOf(10), "Gray wolf", LocalDate.of(2023, 1, 1));

            List<Animal> allAnimals = List.of(leapYearWolf, notLeapYearWolf);
            List<String> expected = List.of(leapYearWolf.getName());
            Assertions.assertEquals(expected, searchService.findLeapYearNames(allAnimals));

            List<Animal> notLeapYearAnimals = List.of(notLeapYearWolf);
            expected = List.of();
            Assertions.assertEquals(expected, searchService.findLeapYearNames(notLeapYearAnimals));
        }


        @ParameterizedTest
        @DisplayName("Older animals test")
        @ValueSource(ints = {3, 13, 23})
        void testFindOlderAnimal(int olderThen) {
            Animal older = new Wolf("SomeWolf", BigDecimal.valueOf(10), "Gray wolf", LocalDate.now().minusYears(olderThen + 1));
            Animal younger = new Cat("SomeCat", BigDecimal.valueOf(10), "Simple Cat", LocalDate.now().minusYears(olderThen));
            List<Animal> animals = List.of(younger, older);

            List<Animal> expected = List.of(older);
            Assertions.assertEquals(expected, searchService.findOlderAnimal(animals, olderThen));

        }

        @Test
        @DisplayName("Duplicates test")
        void testFindDuplicate() {
            Animal animal1 = new Cat("Barsik", BigDecimal.valueOf(1), "simple cat", LocalDate.now());
            Animal animal2 = new Wolf("SomeWolf", BigDecimal.valueOf(10), "Gray wolf", LocalDate.now());
            List<Animal> animals = List.of(animal1,animal1,animal2);
            Map<Animal, Integer> expected = Map.of(animal1,2, animal2,1);
            Assertions.assertEquals(expected, searchService.findDuplicate(animals));
        }
    }
}

package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.BeerCSVRecord;
import org.junit.jupiter.api.Test;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BeerCsvServiceImplTest {

    BeerCsvService service = new BeerCsvServiceImpl();

    @Test
    void convertCSV() throws FileNotFoundException {

        File file = ResourceUtils.getFile("classpath:csvdata/beers.csv");

        List<BeerCSVRecord> recs = service.convertCSV(file);

        assertThat(recs.size()).isGreaterThan(0);
    }
}
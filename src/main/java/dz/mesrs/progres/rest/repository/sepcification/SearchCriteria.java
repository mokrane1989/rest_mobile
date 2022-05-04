package dz.mesrs.progres.rest.repository.sepcification;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by k.kezzar on 15/12/2021.
 */
@Data
public class SearchCriteria {
    private String key;
    private String operation;
    private Object value;

    public SearchCriteria(String key, String operation, Object value) {
        this.key = key;
        this.operation = operation;
        this.value = value;
    }
}
package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class RepairOrder {

    private long id;
    private LocalDateTime dateAdded;
    private LocalDateTime dateTaken;
    private String description;
    private boolean urgence;

    public RepairOrder(String description, boolean urgence) {
        this.description = description;
        this.urgence = urgence;
    }

    public static class RepairBuldier {


        private String description;
        private boolean urgence;

        public RepairBuldier setDescription(String description) {
            this.description = description;
            return this;
        }

        public RepairBuldier setUrgence(boolean urgence) {
            this.urgence = urgence;
            return this;
        }


        public RepairOrder createRepair() {
            return new RepairOrder(description, urgence);
        }

    }


}
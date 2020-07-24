import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Hero {
    private String name;
    private int DPM;
    private String position;
}
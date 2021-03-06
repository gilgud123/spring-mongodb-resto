package be.kdv.takeaway.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonSerialize(as = OrderCommand.class)
@JsonDeserialize(as = OrderCommand.class)
public class OrderCommand {

    @NotNull
    private String customerName;

    @NotNull
    private List<Integer> meals;
}

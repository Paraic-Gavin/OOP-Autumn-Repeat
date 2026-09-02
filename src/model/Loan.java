package model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.time.LocalDate;


@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = Generation)
    private Long loanId;

    @NotBlank
    private String assetTag;

    @NotBlank
    @Email
    private String studentEmail;

    enumerated(EnumType.STRING)
    private EquipmentType equipmentType;

    enumerated(EnumType.STRING)
    private LocalDate loanDate;

    @Min (1)
    private int loanDays;

    enumerated(EnumType.STRING)
    private LoanStatus loanStatus;

    public Loan()




}

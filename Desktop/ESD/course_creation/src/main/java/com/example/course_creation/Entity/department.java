//package Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import java.util.Set;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity(name = "Departments")
//public class department {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="department_id")
//    private Integer departmentId;
//    @Column(name="department_name",nullable = false)
//    private String name;
//    @Column(name="capacity",nullable = false)
//    private Integer capacity;
//
//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
//    private Set<employee> employees;
//
//
//}

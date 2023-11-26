//package Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.List;
//
//@Entity(name="Domains")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class domain {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="domain_id")
//    private Integer domainId;
//    @Column(name="program",nullable = false)
//    private String program;
//    @Column(name="batch",nullable = false)
//    private Integer batch;
//    @Column(name="capacity",nullable = false)
//    private Integer capacity;
//    @Column(name="qualification")
//    private String qualification;
//
//    @ManyToMany
//    @JoinTable(name="Course_Domain",joinColumns = {@JoinColumn(name="domain_id")},
//            inverseJoinColumns = {@JoinColumn(name="course_id")})
//    private List<course> courses;
//}

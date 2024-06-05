package Services;

import java.util.List;

import Entities.Cours;
import Repositories.CoursRepository;


public class CoursServices {
    private CoursRepository coursRepository=new CoursRepository();
    public void ajouterCours(Cours cours){
        coursRepository.insert(cours);
       }
    
       public List<Cours> listerCours(){
      return coursRepository.selectAll();
   }
    

}

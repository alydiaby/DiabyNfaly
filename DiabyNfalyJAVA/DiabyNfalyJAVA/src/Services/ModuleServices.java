package Services;

import java.util.List;


import Repositories.ModuleRepository;

public class ModuleServices {
    private ModuleRepository moduleRepository=new ModuleRepository();
    
    public void ajouterModule(Module module){
        moduleRepository.insert(module);
       }
    public List<Module> listerModule(){
      return moduleRepository.selectAll();
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.flowlayoutframe;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
        
public class FlowLayoutFrame {
    
    private JButton leftJButton;
    private JButton centerJButton;
    private JButton rightJButton;
    private FlowLayout layout;
    private Container container;
    
    public FlowLayoutFrame(){
        super("FlowLayout Demo")
                layout = new FLowLayout();
                container = getContentPane();
                setLayout(layout );
                
                leftJButton = new JButton("Left");
                add( leftJButton);
                leftJButton.addActionListener( new ActionListener());
                       
                        public void actionPerfomed(ActionEvent event){
                            layout.setAlignment(FlowLayout.LEFT);
                            layout.layoutContainer(container);
                        }
                centerJButton = new JButton("center");
                add(centerJButton):
                centerJButton.addActionListener(
                 new ActionListener()
                        
                     public void actionPerfomed(ActionEvent event){
                         layout.setAlignment(FlowLayout.CENTER);
                         layout.layoutContainer(container);
                         
                     }
              );
              rightJButton = new JButton("Right");
              add( rightJButton);
              rightJButton.addActionListener(
              new ActionListener()
                      public void actionPerfomed( ActionEvent event){
                          layout.setAlignment(FLowLayout.RIGHT);
                          layout.layoutContainer(container);
                          
                    }
                              
              
              ):
            }
        
    }
}
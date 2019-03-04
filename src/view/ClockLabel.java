/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.SwingConstants;
class ClockLabel extends JLabel implements ActionListener {
 
  String type;
  SimpleDateFormat sdf;
 
  public ClockLabel(String type) {
    this.type = type;
    setForeground(Color.BLACK);
 
    switch (type) {
      case "hour" : sdf = new SimpleDateFormat("hh");
                    setFont(new Font("Calibri", Font.PLAIN, 24));
                    setHorizontalAlignment(SwingConstants.LEFT);
                    break;
      case "minute" : sdf = new SimpleDateFormat("mm");
                    setFont(new Font("Calibri", Font.PLAIN, 24));
                    setHorizontalAlignment(SwingConstants.CENTER);
                    break;
      case "ampm"  : sdf = new SimpleDateFormat("a");
                    setFont(new Font("Calibri", Font.PLAIN, 16));
                    setHorizontalAlignment(SwingConstants.RIGHT);
                    break;
      default     : sdf = new SimpleDateFormat();
                    break;
    }
 
    Timer t = new Timer(1000, this);
    t.start();
  }
 
  public void actionPerformed(ActionEvent ae) {
    Date d = new Date();
    setText(sdf.format(d));
  }
   
}



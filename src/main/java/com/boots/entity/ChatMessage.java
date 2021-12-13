package com.boots.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ChatMessage {
   @Id
   private String id;
   private String chatId;
   private String senderId;
   private String recipientId;
   private String senderName;
   private String recipientName;
   private String content;
   private Date timestamp;
   private MessageStatus status;

   public void setStatus(MessageStatus status) {
      this.status = status;
      return;
   }

   public String getId() {
      return this.id;
   }

   public String getChatId() {
      return this.chatId;
   }

   public String getSenderId() {
      return this.senderId;
   }

   public String getSenderName() {
      return this.senderName;
   }

   public String getRecipientId() {
      return this.recipientId;
   }
}

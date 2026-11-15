.class public final synthetic Lcom/google/firebase/messaging/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/Y;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/Y;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/X;->a:Lcom/google/firebase/messaging/Y;

    iput-object p2, p0, Lcom/google/firebase/messaging/X;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/X;->a:Lcom/google/firebase/messaging/Y;

    iget-object v1, p0, Lcom/google/firebase/messaging/X;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/google/firebase/messaging/Y;->a(Lcom/google/firebase/messaging/Y;Ljava/lang/String;Lz3/l;)Lz3/l;

    move-result-object p1

    return-object p1
.end method

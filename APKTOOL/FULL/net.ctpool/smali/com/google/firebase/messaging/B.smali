.class public final synthetic Lcom/google/firebase/messaging/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/h;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/FirebaseMessaging;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/B;->a:Lcom/google/firebase/messaging/FirebaseMessaging;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/B;->a:Lcom/google/firebase/messaging/FirebaseMessaging;

    check-cast p1, Ln3/a;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->g(Lcom/google/firebase/messaging/FirebaseMessaging;Ln3/a;)V

    return-void
.end method

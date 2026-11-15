.class public final synthetic Lcom/android/billingclient/api/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/c;

.field public final synthetic b:Lcom/android/billingclient/api/h;

.field public final synthetic c:LC0/f;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/c;Lcom/android/billingclient/api/h;LC0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/m;->a:Lcom/android/billingclient/api/c;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/m;->b:Lcom/android/billingclient/api/h;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/billingclient/api/m;->c:LC0/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/m;->a:Lcom/android/billingclient/api/c;

    iget-object v1, p0, Lcom/android/billingclient/api/m;->b:Lcom/android/billingclient/api/h;

    iget-object v2, p0, Lcom/android/billingclient/api/m;->c:LC0/f;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/c;->l0(Lcom/android/billingclient/api/h;LC0/f;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method

.class final Lcom/android/billingclient/api/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LC0/g;

.field final synthetic c:Lcom/android/billingclient/api/c;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/c;Ljava/lang/String;LC0/g;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/android/billingclient/api/r;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/android/billingclient/api/r;->b:LC0/g;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/android/billingclient/api/r;->c:Lcom/android/billingclient/api/c;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/r;->c:Lcom/android/billingclient/api/c;

    iget-object v1, p0, Lcom/android/billingclient/api/r;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/c;->f0(Lcom/android/billingclient/api/c;Ljava/lang/String;)Lcom/android/billingclient/api/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/v;->a()Lcom/android/billingclient/api/e;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/billingclient/api/v;->b()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/android/billingclient/api/r;->b:LC0/g;

    invoke-interface {v2, v1, v0}, LC0/g;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    const/4 v0, 0x0

    return-object v0
.end method

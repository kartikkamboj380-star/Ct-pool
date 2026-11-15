.class public final synthetic Lcom/android/billingclient/api/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/c;

.field public final synthetic b:LC0/d;

.field public final synthetic c:LC0/e;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/c;LC0/d;LC0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/j;->a:Lcom/android/billingclient/api/c;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/j;->b:LC0/d;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/billingclient/api/j;->c:LC0/e;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/j;->a:Lcom/android/billingclient/api/c;

    iget-object v1, p0, Lcom/android/billingclient/api/j;->b:LC0/d;

    iget-object v2, p0, Lcom/android/billingclient/api/j;->c:LC0/e;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/c;->k0(LC0/d;LC0/e;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method

.class public Lcom/android/billingclient/api/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/d$c$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I


# direct methods
.method synthetic constructor <init>(LC0/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/android/billingclient/api/d$c;->c:I

    .line 6
    .line 7
    return-void
.end method

.method public static a()Lcom/android/billingclient/api/d$c$a;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/billingclient/api/d$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/d$c$a;-><init>(LC0/s;)V

    return-object v0
.end method

.method static bridge synthetic c(Lcom/android/billingclient/api/d$c;)Lcom/android/billingclient/api/d$c$a;
    .locals 2

    .line 1
    invoke-static {}, Lcom/android/billingclient/api/d$c;->a()Lcom/android/billingclient/api/d$c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/d$c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/d$c$a;->f(Ljava/lang/String;)Lcom/android/billingclient/api/d$c$a;

    iget v1, p0, Lcom/android/billingclient/api/d$c;->c:I

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/d$c$a;->d(I)Lcom/android/billingclient/api/d$c$a;

    iget-object p0, p0, Lcom/android/billingclient/api/d$c;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lcom/android/billingclient/api/d$c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/d$c$a;

    return-object v0
.end method

.method static bridge synthetic f(Lcom/android/billingclient/api/d$c;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d$c;->a:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic g(Lcom/android/billingclient/api/d$c;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d$c;->b:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic h(Lcom/android/billingclient/api/d$c;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/billingclient/api/d$c;->c:I

    return-void
.end method


# virtual methods
.method final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/billingclient/api/d$c;->c:I

    return v0
.end method

.method final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d$c;->a:Ljava/lang/String;

    return-object v0
.end method

.method final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d$c;->b:Ljava/lang/String;

    return-object v0
.end method

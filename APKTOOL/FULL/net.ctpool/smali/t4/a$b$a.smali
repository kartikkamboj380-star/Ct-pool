.class public final Lt4/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt4/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Bundle;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lt4/a$b$a;->a:Landroid/os/Bundle;

    .line 10
    .line 11
    const-string v1, "apn"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()Lt4/a$b;
    .locals 3

    .line 1
    new-instance v0, Lt4/a$b;

    .line 2
    .line 3
    iget-object v1, p0, Lt4/a$b$a;->a:Landroid/os/Bundle;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lt4/a$b;-><init>(Landroid/os/Bundle;Lt4/a$a;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public b(Landroid/net/Uri;)Lt4/a$b$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/a$b$a;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "afl"

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public c(I)Lt4/a$b$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/a$b$a;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "amv"

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

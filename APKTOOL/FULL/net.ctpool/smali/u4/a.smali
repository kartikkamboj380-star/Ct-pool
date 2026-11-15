.class public Lu4/a;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu4/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:I

.field private p:J

.field private q:Landroid/os/Bundle;

.field private r:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu4/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lu4/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu4/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IJLandroid/os/Bundle;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu4/a;->m:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lu4/a;->n:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lu4/a;->o:I

    .line 9
    .line 10
    iput-wide p4, p0, Lu4/a;->p:J

    .line 11
    .line 12
    iput-object p6, p0, Lu4/a;->q:Landroid/os/Bundle;

    .line 13
    .line 14
    iput-object p7, p0, Lu4/a;->r:Landroid/net/Uri;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public B0()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/a;->q:Landroid/os/Bundle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public H0()I
    .locals 1

    .line 1
    iget v0, p0, Lu4/a;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public S0()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/a;->r:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public a0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/a;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public h1(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lu4/a;->p:J

    .line 2
    .line 3
    return-void
.end method

.method public n0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/a;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public w()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lu4/a;->p:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lu4/b;->c(Lu4/a;Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

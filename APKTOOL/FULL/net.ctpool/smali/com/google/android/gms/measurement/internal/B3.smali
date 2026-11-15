.class public final enum Lcom/google/android/gms/measurement/internal/B3;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/google/android/gms/measurement/internal/B3;

.field public static final enum o:Lcom/google/android/gms/measurement/internal/B3;

.field private static final synthetic p:[Lcom/google/android/gms/measurement/internal/B3;


# instance fields
.field private final m:[Lcom/google/android/gms/measurement/internal/A3$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/measurement/internal/B3;

    sget-object v1, Lcom/google/android/gms/measurement/internal/A3$a;->n:Lcom/google/android/gms/measurement/internal/A3$a;

    sget-object v2, Lcom/google/android/gms/measurement/internal/A3$a;->o:Lcom/google/android/gms/measurement/internal/A3$a;

    filled-new-array {v1, v2}, [Lcom/google/android/gms/measurement/internal/A3$a;

    move-result-object v1

    const-string v2, "STORAGE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/measurement/internal/B3;-><init>(Ljava/lang/String;I[Lcom/google/android/gms/measurement/internal/A3$a;)V

    sput-object v0, Lcom/google/android/gms/measurement/internal/B3;->n:Lcom/google/android/gms/measurement/internal/B3;

    new-instance v1, Lcom/google/android/gms/measurement/internal/B3;

    sget-object v2, Lcom/google/android/gms/measurement/internal/A3$a;->p:Lcom/google/android/gms/measurement/internal/A3$a;

    filled-new-array {v2}, [Lcom/google/android/gms/measurement/internal/A3$a;

    move-result-object v2

    const-string v3, "DMA"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lcom/google/android/gms/measurement/internal/B3;-><init>(Ljava/lang/String;I[Lcom/google/android/gms/measurement/internal/A3$a;)V

    sput-object v1, Lcom/google/android/gms/measurement/internal/B3;->o:Lcom/google/android/gms/measurement/internal/B3;

    filled-new-array {v0, v1}, [Lcom/google/android/gms/measurement/internal/B3;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/measurement/internal/B3;->p:[Lcom/google/android/gms/measurement/internal/B3;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;I[Lcom/google/android/gms/measurement/internal/A3$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/B3;->m:[Lcom/google/android/gms/measurement/internal/A3$a;

    return-void
.end method

.method static bridge synthetic h(Lcom/google/android/gms/measurement/internal/B3;)[Lcom/google/android/gms/measurement/internal/A3$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/B3;->m:[Lcom/google/android/gms/measurement/internal/A3$a;

    return-object p0
.end method

.method public static values()[Lcom/google/android/gms/measurement/internal/B3;
    .locals 1

    sget-object v0, Lcom/google/android/gms/measurement/internal/B3;->p:[Lcom/google/android/gms/measurement/internal/B3;

    invoke-virtual {v0}, [Lcom/google/android/gms/measurement/internal/B3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/measurement/internal/B3;

    return-object v0
.end method


# virtual methods
.method public final e()[Lcom/google/android/gms/measurement/internal/A3$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B3;->m:[Lcom/google/android/gms/measurement/internal/A3$a;

    return-object v0
.end method

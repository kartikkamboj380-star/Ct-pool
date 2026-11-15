.class abstract Lcom/google/android/gms/internal/play_billing/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Iterator;

.field private static final b:Ljava/lang/Iterable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/l1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/l1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/n1;->a:Ljava/util/Iterator;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/m1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/m1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/n1;->b:Ljava/lang/Iterable;

    return-void
.end method

.method static a()Ljava/lang/Iterable;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/n1;->b:Ljava/lang/Iterable;

    return-object v0
.end method

.method static bridge synthetic b()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/n1;->a:Ljava/util/Iterator;

    return-object v0
.end method

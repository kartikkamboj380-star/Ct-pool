.class public Lorg/greenrobot/eventbus/android/AndroidComponentsImpl;
.super Lm6/a;
.source "SourceFile"


# static fields
.field public static final synthetic d:I


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lm6/c;

    const-string v1, "EventBus"

    invoke-direct {v0, v1}, Lm6/c;-><init>(Ljava/lang/String;)V

    new-instance v1, Lm6/d;

    invoke-direct {v1}, Lm6/d;-><init>()V

    invoke-direct {p0, v0, v1}, Lm6/a;-><init>(Ll6/g;Ll6/h;)V

    return-void
.end method
